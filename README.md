# s3-file-upload

## Run the code
1. Add the logic to add content to csv or other file in class `CSVFileWriter.writeDataLineByLine` method
1. All the S3 related configuration needs to be added into the `application.properties` file and can be pulled in `AmazonS3Config` class 
1. `UploadFile.upload` method have the logic to convert the created file into `Multipart` file and uploading the file to s3 bucket

 

