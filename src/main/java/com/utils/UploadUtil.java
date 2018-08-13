package com.utils;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UploadUtil {
    private static ServletContext servletContext;

    //上传文件
    public static String uploadFile(HttpServletRequest request, MultipartFile uploadFile) throws IOException {
        //创建时分秒毫秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
        String res = sdf.format(new Date());
        //uploads文件夹位置
        //String pic_path = request.getSession().getServletContext().getRealPath("/static/upload/");
        String rootPath = request.getSession().getServletContext().getRealPath("/static/upload/");
        System.out.println("@@@@@@@@@@@@@@@" + rootPath);
        //原始名称
        String originalFilename = uploadFile.getOriginalFilename();
        //新的文件名称
        String newFileName = "美团" + res + originalFilename.substring(originalFilename.lastIndexOf("."));
        //创建年月文件夹
//        Calendar date = Calendar.getInstance();
//        File dateDirs = new File(date.get(Calendar.YEAR)
//                + File.separator + (date.get(Calendar.MONTH)+1));
        //新文件
        File newFile = new File(rootPath + File.separator + newFileName);
        //判断目标文件所在的目录是否存在，不存在，则创建父目录
        if (!newFile.getParentFile().exists()) {
            newFile.getParentFile().mkdirs();
        }
        System.out.println("########" + newFile);
        //将内存中的数据写入磁盘，把图片数据存进路径
        uploadFile.transferTo(newFile);
        //完整的url
        String fileUrl = newFileName;
        System.out.println("@@@fileUrl@@@@@@" + fileUrl);
        return fileUrl;
    }
}
