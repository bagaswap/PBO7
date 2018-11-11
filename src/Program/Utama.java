package Program;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utama {

    public static void main(String[] args){
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try{
            //buat objek instansi
            Login user1 = new Login();
            Login user2 = new Login("","");
            
            while(true){
                //menu
                System.out.println("================");
                System.out.println("MENU LOGIN");
                System.out.println("================");
                System.out.println("1. Login Admin");
                System.out.println("2. Ubah Password Admin");
                System.out.println("3. Buat User");
                System.out.println("4. Lihat Data User");
                System.out.println("5. Keluar");
                System.out.println("================");
                
                //input
                System.out.print("Masukkan pilihan : ");
                int pilih=Integer.parseInt(read.readLine());
                
                //proses+output
                switch(pilih){
                    case 1 :
                        System.out.print("Masukkan username : ");
                        String my_user=read.readLine();
                        System.out.print("Masukkan password : ");
                        String my_password=read.readLine();
                        
                       if(my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword()))
                       {
                           System.out.println("*** LOGIN SUKSES ***");
                       }
                       else
                       {
                           System.out.println("*** LOGIN GAGAL ***");
                       }
                        break;
                    case 2 :
                        System.out.print("Masukkan password lama : ");
                        String old_password=read.readLine();
                        System.out.print("Masukkan password baru : ");
                        String new_password=read.readLine();
                        
                        if(old_password.equals(user1.getPassword()))
                        {
                            user1.setPassword(new_password);
                            System.out.println("*** Password berhasil dirubah ***");
                        }
                        else
                        {
                            System.out.println("*** Anda salah memasukkan password lama ***");
                        }
                        break;
                    case 3 :
                         System.out.println("Masukkan username : ");
                        String create_user=read.readLine();
                        System.out.println("Masukkan password : ");
                        String create_password=read.readLine();
                        
                        user2=new Login(create_user,create_password);
                        
                        System.out.println("*** User telah berhasil dibuat ***");
                        break;
                    case 4 :
                        System.out.println("*** Tampilkan Data ***");
                        System.out.println("=== User 1 ===");
                        System.out.println("Username    : "+user1.getUsername());
                        System.out.println("Password    : "+user1.getPassword());
                        System.out.println("=== User 2 ===");
                        System.out.println("Username    : "+user2.getUsername());
                        System.out.println("Password    : "+user2.getPassword());
                        break;
                    case 5 :
                        System.exit(0);
                        break;
                    default :
                        System.out.println("SALAH INPUT BOSQUE");
                        
                     
                }
            }
        }catch(Exception e){
            System.out.println("Pesan error : "+e);
        }
    }
    
}