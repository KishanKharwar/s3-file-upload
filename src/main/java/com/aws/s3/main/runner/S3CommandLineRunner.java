package com.aws.s3.main.runner;

import com.aws.s3.main.service.UploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
public class S3CommandLineRunner implements CommandLineRunner {

    @Autowired
    private UploadFile uploadFile;

    @Override
    public void run(String... args) throws Exception {
        uploadFile.upload("D:\\CodeBase\\Kishan\\s3-file-upload\\s3-file-upload\\abc.csv");
    }
}
