package com.bts.appbts.Service;

import com.bts.appbts.Model.message;
import com.bts.appbts.Model.DefaultValues;
import com.bts.appbts.Model.ProcessingCode;
import com.bts.appbts.Repository.messageRepository;
import com.bts.appbts.Repository.DefaultValuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class messageService {
    private final messageRepository messageRepository;
    private final ProcessingCodeService processingCodeService;
    private final DefaultValuesRepository defaultValuesRepository;
   
    @Autowired
    public messageService(messageRepository messageRepository, ProcessingCodeService processingCodeService, DefaultValuesRepository defaultValuesRepository) {
        this.messageRepository = messageRepository;
        this.processingCodeService = processingCodeService;
        this.defaultValuesRepository=defaultValuesRepository;
    }

    
    
    
  
    

  
    public List<message> getAllBts() {
        return messageRepository.findAll();
    }

    public message getBtsByMsgSeq(String msg_seq) {
        return messageRepository.findById(msg_seq).orElse(null);
    }
    public message saveBts(message pwrcertmessages) {
        // Retrieve the processing code based on the provided code
        String processingCode = pwrcertmessages.getOnl_de_003();
        ProcessingCode code = processingCodeService.findByCode(processingCode);

        // Set the processing code in the Bts entity
        pwrcertmessages.setProcessingCode(code);
        // Retrieve the DefaultValues object
        DefaultValues defaultValues = defaultValuesRepository.findAll().stream().findFirst().orElse(null);

        if (defaultValues != null) {
            
            if (pwrcertmessages.getActivity_flag() == null || pwrcertmessages.getActivity_flag().isEmpty()) {
                pwrcertmessages.setActivity_flag(defaultValues.getActivity_flag());
            }
           
            if (pwrcertmessages.getSend_count() == 0) {
                pwrcertmessages.setSend_count(defaultValues.getSend_count());
            }
            if (pwrcertmessages.getDelay_time() == 0) {
                pwrcertmessages.setDelay_time(defaultValues.getDelay_time());
            }
            if (pwrcertmessages.getChunk_delay() == 0) {
                pwrcertmessages.setChunk_delay(defaultValues.getChunk_delay());
            }
            if (pwrcertmessages.getResponse_flag() == null || pwrcertmessages.getResponse_flag().isEmpty()) {
                pwrcertmessages.setResponse_flag(defaultValues.getResponse_flag());
            }
            if (pwrcertmessages.getReversal_flag() == null || pwrcertmessages.getReversal_flag().isEmpty()) {
                pwrcertmessages.setReversal_flag(defaultValues.getReversal_flag());
            }
           
         
            if (pwrcertmessages.getOnl_de_018() == null || pwrcertmessages.getOnl_de_018().isEmpty()) {
                pwrcertmessages.setOnl_de_018(defaultValues.getOnl_de_018());
            }
           
            if (pwrcertmessages.getOnl_de_024() == null || pwrcertmessages.getOnl_de_024().isEmpty()) {
                pwrcertmessages.setOnl_de_024(defaultValues.getOnl_de_024());
            }
            if (pwrcertmessages.getOnl_de_027() == null || pwrcertmessages.getOnl_de_027().isEmpty()) {
                pwrcertmessages.setOnl_de_027(defaultValues.getOnl_de_027());
            }
            if (pwrcertmessages.getOnl_de_032() == null || pwrcertmessages.getOnl_de_032().isEmpty()) {
                pwrcertmessages.setOnl_de_032(defaultValues.getOnl_de_032());
            }
            if (pwrcertmessages.getOnl_de_039() == null || pwrcertmessages.getOnl_de_039().isEmpty()) {
                pwrcertmessages.setOnl_de_039(defaultValues.getOnl_de_039());
            }
            if (pwrcertmessages.getOnl_de_043() == null || pwrcertmessages.getOnl_de_043().isEmpty()) {
                pwrcertmessages.setOnl_de_043(defaultValues.getOnl_de_043());
            }
            if (pwrcertmessages.getOnl_de_048() == null || pwrcertmessages.getOnl_de_048().isEmpty()) {
                pwrcertmessages.setOnl_de_048(defaultValues.getOnl_de_048());
            }
            if (pwrcertmessages.getOnl_de_049() == null || pwrcertmessages.getOnl_de_049().isEmpty()) {
                pwrcertmessages.setOnl_de_049(defaultValues.getOnl_de_049());
            }
            if (pwrcertmessages.getOnl_de_057() == null || pwrcertmessages.getOnl_de_057().isEmpty()) {
                pwrcertmessages.setOnl_de_057(defaultValues.getOnl_de_057());
            }
            if (pwrcertmessages.getOnl_de_061() == null || pwrcertmessages.getOnl_de_061().isEmpty()) {
                pwrcertmessages.setOnl_de_061(defaultValues.getOnl_de_061());
            }
           
            if (pwrcertmessages.getOnl_de_100() == null || pwrcertmessages.getOnl_de_100().isEmpty()) {
                pwrcertmessages.setOnl_de_100(defaultValues.getOnl_de_100());
            }
            
            if (pwrcertmessages.getUser_create() == null || pwrcertmessages.getUser_create().isEmpty()) {
                pwrcertmessages.setUser_create(defaultValues.getUser_create());
            }
            if (pwrcertmessages.getUser_modif() == null || pwrcertmessages.getUser_modif().isEmpty()) {
                pwrcertmessages.setUser_modif(defaultValues.getUser_modif());
            }
        }
        
        return messageRepository.save(pwrcertmessages);
    }
    
    

    public void deleteBts(String msg_seq) {
        messageRepository.deleteById(msg_seq);
    }
    public void truncateTable() {
        messageRepository.deleteAll(); // This will delete all records from the table
    }

}
