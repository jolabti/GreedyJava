package greedyjava;

/*
    @author johan
#include 
#include 
int jml,a,b,c,d,e,f,koin;
void main()
{
clrscr();
koin=0;
printf(”Input jumlah uang : “);
scanf (”%d”,&jml);
printf (”Input nilai koin A : “);
scanf (”%d”,&a);
printf (”Input nilai koin B : “);
scanf (”%d”,&b);
printf (”Input nilai koin C : “);
scanf (”%d”,&c);
if (a>b & b>c)
{
d=a;
e=b;
f=c;
}
else if (a>c & c>b)
{
d=a;
e=c;
f=b;
}
else if (b>a & a>c)
{
d=b;
e=a;
f=c;
}
else if (b>c & c>a)
{
d=b;
e=c;
f=a;
}
else if (c>a & a>b)
{
d=c;
e=a;
f=b;
}
else if (c>b & b>a)
{
d=c;
e=b;
f=a;
}
while (jml>=d)
{
jml= jml-d;
koin = koin++;
}
while (jml>=e)
{
jml=jml-e;
koin = koin++;
}
while (jml>=f)
{
jml=jml-f;
koin = koin++;
}
printf (”Banyaknya koin adalah %d koin”,koin);
getch();
}
 */
public class GreedyJava {

    public static void main(String[] args) {
        
      Penukaran pnk = new Penukaran();
      
      pnk.inputUang(300000);

    }

   
}
 


     
