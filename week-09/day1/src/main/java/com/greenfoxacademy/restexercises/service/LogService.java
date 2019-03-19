package com.greenfoxacademy.restexercises.service;

import com.greenfoxacademy.restexercises.model.Log;
import com.greenfoxacademy.restexercises.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogService {

    LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository){
        this.logRepository = logRepository;
    }

    public void addLog(Log log) {
        logRepository.save(log);
    }

    public List<Log> getLogs() {
        List<Log> logs = new ArrayList<>();
        logRepository.findAll()
                .forEach(logs::add);
        return logs;
    }
}
