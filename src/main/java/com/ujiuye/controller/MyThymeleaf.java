package com.ujiuye.controller;

import com.ujiuye.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller//这里不是加RestController，因为要经过视图渲染，返回的是页面
public class MyThymeleaf {

    @RequestMapping("/demo1")
    public String demo1(Model m){
        String msg="hell";
        m.addAttribute("msg",msg);
        return "demo1";
    }

    @RequestMapping("/demo2")
    public String demo2(Model model){
        User user=new User(1L,"ceshi",100);
        model.addAttribute("user",user);

        Map map=new HashMap();
        map.put("addre","测试1");
        map.put("addre2","测试2");
        map.put("addre3","测试3");
        map.put("pic","C:\\Users\\Administrator\\Desktop\\项目图片\\ck1.jpg");
        model.addAttribute("map",map);
        return "demo2";
    }
    @RequestMapping("/demo3")
    public String demo3(Model m){
        List<User> list=new ArrayList();
        list.add(new User(1L,"张三",100));
        list.add(new User(2L,"张三2",200));
        list.add(new User(3L,"张三3",300));
        list.add(new User(4L,"张三4",400));
        m.addAttribute("list",list);
        return "demo3";
    }
    @RequestMapping("/demo4")
    public String demo4(Model m){
        m.addAttribute("user","有几页");
        m.addAttribute("href","https://www.baidu.com");
        return "demo4";
    }
    @RequestMapping("/demo5")
    public String demo5(Model m){
        m.addAttribute("flag","yes");
        m.addAttribute("flag2","yes2");
        m.addAttribute("flag3","yes3");
        return "demo5";
    }
    @RequestMapping("/demo6")
    public String demo6(Model m){
        m.addAttribute("now",new Date());
        Double dou=1232.1132;
        m.addAttribute("dou",dou);
        String str="1sdfasfdasd2fsadfas3dfkslfdksfdj";
        m.addAttribute("str",str);
        return "demo6";
    }
}
