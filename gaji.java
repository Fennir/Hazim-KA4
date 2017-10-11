import java.util.Scanner;
public class gaji
{
public static void main (String args[])
{
Scanner input = new Scanner(System.in);

System.out.print("Masukkan nama: ");
String nama=input.next();

int bil_jam_sehari;
do{
System.out.print("Masukkan bilangan jam kerja sehari: ");
bil_jam_sehari=input.nextInt();
if(bil_jam_sehari >9)
{System.out.println("Bilangan jam sehari tidak boleh lebih 9 jam, sila masukkan bilangan jam dengan betul.");}
}while(bil_jam_sehari>9);


int bil_hari;
do{
System.out.print("Masukkan bilangan hari kerja: ");
bil_hari=input.nextInt();
if(bil_hari >30)
{System.out.println("Bilangan hari bekerja tidak boleh lebih 30 hari, sila masukkan hari bekerja dengan betul.");}
}while(bil_hari>30);


int bil_jam;
do{
System.out.print("Masukkan bilangan jam kerja lebih masa: ");
bil_jam=input.nextInt();
if(bil_jam >50)
{System.out.println("Bilangan jam kerja lebih masa tidak boleh lebih 50jam, sila masukkan bilangan jam dengan betul.");}
}while(bil_jam>50);

double gaji = (bil_jam_sehari * bil_hari * 20) + (bil_jam * 15);

System.out.println("Nama: "+nama);
System.out.println("Bilangan jam bekerja sehari: "+bil_jam_sehari);
System.out.println("Bilangan hari bekerja: "+bil_hari);
System.out.println("Jam kerja lebih masa: "+bil_jam);
System.out.println("Gaji: RM"+gaji);

}
} 