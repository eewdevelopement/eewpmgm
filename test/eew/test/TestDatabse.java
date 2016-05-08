/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eew.test;

import com.eew.service.DatabaseMaster;
import java.util.List;

/**
 *
 * @author yuvraj
 */
public class TestDatabse {

    public static void main(String[] args) {
        List<Object> list = DatabaseMaster.getList("TblHod");
        for (Object object : list) {
            System.out.println("object = " + object);
        }

    }

}
