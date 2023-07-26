/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public interface DataController {

    String EMP_FILE = "nhanvien.dat";

    <T> void writeToFile(ArrayList<T> t, String fileName);

    <T> ArrayList<T> readDataFromFile(String fileName);
}
