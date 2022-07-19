package com.aws.s3.main;

import com.aws.s3.main.service.UploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S3FileUploadApplication  implements CommandLineRunner {

	private final UploadFile uploadFile;

	public static void main(String[] args) {
		SpringApplication.run(S3FileUploadApplication.class, args).close();
	}

	public S3FileUploadApplication(UploadFile uploadFile){
		this.uploadFile = uploadFile;
	}

	@Override
	public void run(String... args) throws Exception {
		uploadFile.upload("D:\\CodeBase\\Kishan\\s3-file-upload\\abc.csv");
	}

}
