package com.Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {
   public static void main(String args[]) throws IOException {
       String source="D:\\rr", destination = "D:\\New folder";
       File file = new File(source);
       readFile(file, destination);     
   }
   
   public static void readFile(File file, String path) throws IOException {
          if(file.isDirectory()) {
              System.out.println("DIR "+ file.getAbsolutePath());
              File[] files = file.listFiles();
              String tndir = path + "\\" + file.getName();
              File nfile = new File(tndir);
              if(!nfile.exists()) {
                  nfile.mkdirs();
              }
              for(int i=0; i<files.length; i++) {
                  readFile(files[i],tndir);
              }
          } else {
              String tndir = path + "\\" + file.getName();
              File nfile = new File(tndir);
              if(!nfile.exists()) {
                  nfile.createNewFile();
              }
              System.out.println("File "+ file.getAbsolutePath());
              copyFileUsingStream(file, nfile);
          }
      }
   
   private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

}