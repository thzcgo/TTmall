package com.thzc.ttmall.thirdparty;


import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.PutObjectRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TtmallThirdPartyApplicationTests {

    @Autowired
    private OSSClient ossClient;

    @Test
    public void shangchuanTest1(){

        // 创建PutObjectRequest对象。
        PutObjectRequest putObjectRequest = new PutObjectRequest("thzc-ttmall", "上传cloud", new File("C:\\Users\\zhangcheng\\Pictures\\test.jpg"));
        // 上传文件。
        ossClient.putObject(putObjectRequest);

        // 关闭OSSClient。
        ossClient.shutdown();
        System.out.println("上传成功");
    }




}
