package com.bts.appbts.Controller;

import java.util.List;

import com.bts.appbts.Model.message;
import com.bts.appbts.Model.DefaultValues;
import com.bts.appbts.Model.ProcessingCode;
import com.bts.appbts.Service.messageService;
import com.bts.appbts.Service.ProcessingCodeService;
import com.bts.appbts.Repository.DefaultValuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bts")
public class messageController {
    
    private final messageService messageService;
    private final ProcessingCodeService processingCodeService ;
    private final DefaultValuesRepository defaultValuesRepository ;
    
   
    
    @Autowired
    public messageController(messageService messageService, ProcessingCodeService processingCodeService, DefaultValuesRepository defaultValuesRepository) {
        this.messageService = messageService;
        this.processingCodeService = processingCodeService;
        this.defaultValuesRepository= defaultValuesRepository;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<message>> getAllBts() {
        List<message> pwrcertmessagesList = messageService.getAllBts();
        if (!pwrcertmessagesList.isEmpty()) {
            return ResponseEntity.ok(pwrcertmessagesList);
        }
        return ResponseEntity.notFound().build();
    }
   
    @GetMapping("/{msg_seq}")
    public ResponseEntity<message> getBtsByMsgSeq(@PathVariable("msg_seq") String msgSeq) {
        message pwrcertmessages = messageService.getBtsByMsgSeq(msgSeq);
        if (pwrcertmessages != null) {
            return ResponseEntity.ok(pwrcertmessages);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/processingcodes")
    public ResponseEntity<List<ProcessingCode>> getAllProcessingCodes() {
        List<ProcessingCode> processingCodes = processingCodeService.getAllProcessingCodes();
        return ResponseEntity.ok(processingCodes);
    }


    @PostMapping("/add")
    public ResponseEntity<message> createBts(@RequestBody message pwrcertmessages) {
        message createdPwrcertmessages = messageService.saveBts(pwrcertmessages);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPwrcertmessages);
    }


    @PutMapping("/{msg_seq}")
    public ResponseEntity<message> updateBts(@PathVariable("msg_seq") String msgSeq, @RequestBody message pwrcertmessages) {
        message existingPwrcertmessages = messageService.getBtsByMsgSeq(msgSeq);
        if (existingPwrcertmessages != null) {
            // Update the fields of the existing Bts object with the new values
            existingPwrcertmessages.setWording(pwrcertmessages.getWording());
            existingPwrcertmessages.setSim_env(pwrcertmessages.getSim_env());
            existingPwrcertmessages.setOnl_de_004(pwrcertmessages.getOnl_de_004());
            existingPwrcertmessages.setOnl_de_003(pwrcertmessages.getOnl_de_003());
            existingPwrcertmessages.setOnl_de_011(pwrcertmessages.getOnl_de_011());
            existingPwrcertmessages.setOnl_de_035(pwrcertmessages.getOnl_de_035());
            existingPwrcertmessages.setOnl_de_037(pwrcertmessages.getOnl_de_037());
            existingPwrcertmessages.setOnl_de_038(pwrcertmessages.getOnl_de_038());
            existingPwrcertmessages.setOnl_de_041(pwrcertmessages.getOnl_de_041());
            existingPwrcertmessages.setOnl_de_042(pwrcertmessages.getOnl_de_042());
            existingPwrcertmessages.setOnl_de_060(pwrcertmessages.getOnl_de_060());
            existingPwrcertmessages.setOnl_de_125(pwrcertmessages.getOnl_de_125());
            existingPwrcertmessages.setOnl_de_012(pwrcertmessages.getOnl_de_012());
            existingPwrcertmessages.setOnl_de_013(pwrcertmessages.getOnl_de_013());
            existingPwrcertmessages.setOnl_de_007(pwrcertmessages.getOnl_de_007());
            existingPwrcertmessages.setMessage_type(pwrcertmessages.getMessage_type());
            existingPwrcertmessages.setLogical_network(pwrcertmessages.getLogical_network());
            existingPwrcertmessages.setFinancial_constitution_id(pwrcertmessages.getFinancial_constitution_id());
            existingPwrcertmessages.setMessage_type(pwrcertmessages.getMessage_type());
            existingPwrcertmessages.setActivity_flag(pwrcertmessages.getActivity_flag());
            existingPwrcertmessages.setSend_count(pwrcertmessages.getSend_count());
            existingPwrcertmessages.setDelay_time(pwrcertmessages.getDelay_time());
            existingPwrcertmessages.setChunk_delay(pwrcertmessages.getChunk_delay());
            existingPwrcertmessages.setResponse_flag(pwrcertmessages.getResponse_flag());
            existingPwrcertmessages.setReversal_flag(pwrcertmessages.getReversal_flag());
           
            existingPwrcertmessages.setOnl_de_018(pwrcertmessages.getOnl_de_018());
            existingPwrcertmessages.setOnl_de_024(pwrcertmessages.getOnl_de_024());
            existingPwrcertmessages.setOnl_de_027(pwrcertmessages.getOnl_de_027());
            existingPwrcertmessages.setOnl_de_032(pwrcertmessages.getOnl_de_032());
            existingPwrcertmessages.setOnl_de_039(pwrcertmessages.getOnl_de_039());
            existingPwrcertmessages.setOnl_de_043(pwrcertmessages.getOnl_de_043());
            existingPwrcertmessages.setOnl_de_048(pwrcertmessages.getOnl_de_048());
            existingPwrcertmessages.setOnl_de_049(pwrcertmessages.getOnl_de_049());
            existingPwrcertmessages.setOnl_de_057(pwrcertmessages.getOnl_de_049());
            existingPwrcertmessages.setOnl_de_061(pwrcertmessages.getOnl_de_061());
            existingPwrcertmessages.setOnl_de_100(pwrcertmessages.getOnl_de_100());
            existingPwrcertmessages.setUser_create(pwrcertmessages.getUser_create());
            existingPwrcertmessages.setUser_modif(pwrcertmessages.getUser_modif());
           

            message updatedPwrcertmessages = messageService.saveBts(existingPwrcertmessages);
            return ResponseEntity.ok(updatedPwrcertmessages);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    
    @GetMapping("/{msg_seq}/onl_de_003/code")
    public ResponseEntity<String> getOnlDe003Code(@PathVariable("msg_seq") String msgSeq) {
        message pwrcertmessages = messageService.getBtsByMsgSeq(msgSeq);
        if (pwrcertmessages != null) {
            String onlDe003Code = pwrcertmessages.getOnl_de_003();
            return ResponseEntity.ok(onlDe003Code);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping("/delete/{msg_seq}")
    public ResponseEntity<Void> deleteBts(@PathVariable("msg_seq") String msgSeq) {
        message pwrcertmessages = messageService.getBtsByMsgSeq(msgSeq);
        if (pwrcertmessages != null) {
            messageService.deleteBts(msgSeq);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/truncate")
    public ResponseEntity<Void> truncateTable() {
        messageService.truncateTable(); // Call the appropriate method in your service to perform the table truncation
        return ResponseEntity.noContent().build();
    }
    
    
    @GetMapping("/default_values")
    public DefaultValues getDefaultValues() {
        // Fetch the default values from the repository
        DefaultValues defaultValues = defaultValuesRepository.findAll().stream().findFirst().orElse(null);

        // Return the default values as the response
        return defaultValues;
    }
    }
  

