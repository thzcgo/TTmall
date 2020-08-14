package com.thzc.ttmall.product;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TtmallProductApplicationTests {

//    @Autowired
//    private OSSClient ossClient;
//
//    @Test
//    public void shangchuanTest1(){
//
//        // 创建PutObjectRequest对象。
//        PutObjectRequest putObjectRequest = new PutObjectRequest("thzc-ttmall", "上传cloud测试图片", new File("C:\\Users\\zhangcheng\\Pictures\\test.jpg"));
//        // 上传文件。
//        ossClient.putObject(putObjectRequest);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("上传成功");
//    }


//    @Test
//    public void shangchuanTest(){
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "http://oss-cn-beijing.aliyuncs.com";
//        // 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，
//        // 请登录 https://ram.console.aliyun.com 创建RAM账号。
//        String accessKeyId = "LTAI4G8FEvBkUu9cRCXQdLSN";
//        String accessKeySecret = "xXlqg0LWhSAiw1iZzcns3BvmzJd8rA";
//
//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//        // 创建PutObjectRequest对象。
//        PutObjectRequest putObjectRequest = new PutObjectRequest("thzc-ttmall", "上传测试图片", new File("C:\\Users\\zhangcheng\\Pictures\\test.jpg"));
//        // 上传文件。
//        ossClient.putObject(putObjectRequest);
//
//        // 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("上传成功");
//    }

}
