//package com.fourward.linkchart.service.impl;
//
//import com.amazonaws.services.s3.AmazonS3Client;
//import lombok.RequiredArgsConstructor;
//import lombok.Value;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Service;
//
//@Slf4j
//@Service("AwsService")
//@RequiredArgsConstructor
//public class AwsService {
//    private final AmazonS3Client amazonS3Client;
//
//    @Value("${cloud.aws.s3.bucket}")
//    private String bucketName;
//
//    public String getImg(String path){
//        return amazonS3Client.getUrl(bucketName, path).toString();
//    }
//}
