package com.bts.appbts.Service;

import java.util.List;

import com.bts.appbts.Model.ProcessingCode;
import com.bts.appbts.Repository.ProcessingCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessingCodeService {
    private final ProcessingCodeRepository processingCodeRepository;

    @Autowired
    public ProcessingCodeService(ProcessingCodeRepository processingCodeRepository) {
        this.processingCodeRepository = processingCodeRepository;
    }

    public ProcessingCode findByCode(String code) {
        return processingCodeRepository.findByCode(code);
    }

    public List<ProcessingCode> getAllProcessingCodes() {
        return processingCodeRepository.findAll();
    }

	
}
