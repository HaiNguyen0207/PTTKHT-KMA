/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Acer
 */
public class DataControllerImp implements DataController {

    @Override
    public <T> void writeToFile(ArrayList<T> t, String fileName) {
        try {
            FileOutputStream fileOutputStream
                    = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(t);
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }

    @Override
    public <T> ArrayList<T> readDataFromFile(String fileName) {
        ArrayList<T> data = new ArrayList<>();
        File file = new File(fileName);
        if (file.length() > 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
                data = (ArrayList<T>) objectInputStream.readObject();
                return data;
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            } catch (ClassNotFoundException ex) {
            }
        }
        return data;
    }
}
