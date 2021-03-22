/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;


public class Encrypter {

    private static  String key = "aesEncryptionKey";
    private static  String initVector = "encryptionIntVec";

    public static String getInitVector() {
        return initVector;
    }

//    public static String getKey() {
//        return key;
//    }    
    

    public static void setInitVector(String initVector) {
        Encrypter.initVector = initVector;
    }    

    public static void setKey(String key) {
        Encrypter.key = key;
    }   
    

    public static String encrypt(String initVector) {
        try {
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(initVector.getBytes());
            return Base64.encodeBase64String(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
