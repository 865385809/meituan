package com.service;

import com.bean.Member;
import com.bean.Store;
import com.dao.MemberMapper;
import com.dao.StoreMapper;
import com.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.InputStream;
import java.util.*;

@Service
public class ExcelService {

    @Autowired
    MemberMapper memberMapper;
    @Autowired
    StoreMapper storeMapper;

    //excel表的导入
    public void uploadPayerCreditInfoExcel(InputStream in, MultipartFile file) throws Exception{
        List<List<Object>> listob = ExcelUtil.getBankListByExcel(in,file.getOriginalFilename());
        List<Store> storeList = new ArrayList<Store>();
        //遍历listob数据，把数据放到List中
        for (int i = 0; i < listob.size(); i++){
            List<Object> ob = listob.get(i);
            Store store = new Store();
            store.setStoName(String.valueOf(ob.get(0)));
            store.setStoType(String.valueOf(ob.get(1)));
            store.setStoCity(String.valueOf(ob.get(2)));
            store.setStoClassify(String.valueOf(ob.get(3)));
            store.setStoAddress(String.valueOf(ob.get(4)));
            store.setStoPrice(Double.parseDouble(String.valueOf(ob.get(5))));
            store.setStoPicture(String.valueOf(ob.get(6)));
            store.setStoTel(String.valueOf(ob.get(7)));
            store.setStoTime(String.valueOf(ob.get(8)));
            store.setSellerId(Integer.parseInt(String.valueOf(ob.get(9))));
            storeMapper.insertSelective(store);
        }
        //List<Member> salaryList = new ArrayList<Member>();
        //遍历listob数据，把数据放到List中
//        for (int i = 0; i < listob.size(); i++) {
//            List<Object> ob = listob.get(i);
//            Member member = new Member();
//            member.setmUsername(String.valueOf(ob.get(0)));
//            member.setmPassword(String.valueOf(ob.get(1)));
//            member.setmMailbox(String.valueOf(ob.get(2)));
//            member.setmPhone(String.valueOf(ob.get(3)));
//            memberMapper.insertSelective(member);
//            salaryList.add(member);
//        }
        //批量插入(方法未实现）
        //memberMapper.insertInfoBatch(salaryList);
    }

    //excel表的导出
    public List<Map<String, String>> selectAllMemberInfo() {
        List<Member> list = memberMapper.selectByExample(null);
        List<Map<String, String>> mapList=new ArrayList<Map<String,String>>();
        for (Member member : list) {
            Map<String, String> map=new HashMap<String, String>();
            map.put("编号", member.getmId()+"");
            map.put("用户名", member.getmUsername());
            map.put("密码", member.getmPassword());
            map.put("邮箱", member.getmMailbox());
            map.put("手机号", member.getmPhone());
            mapList.add(map);
        }
        return mapList;
    }
}
