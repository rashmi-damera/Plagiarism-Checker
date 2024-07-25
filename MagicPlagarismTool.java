import java.util.*;
class MagicPlagarismTool{
static int c1=0,c2=0;
public static void main(String arfgs[]){
Scanner sc=new Scanner(System.in);
HashMap<String, Integer> hm=new HashMap<>(); //intializing  hello file in a map
HashMap<String, Integer> hm1=new HashMap<>(); //intializing  bye file in a map
ArrayList<String> al=new ArrayList<>(); //intializing array list of hello
ArrayList<String> bl=new ArrayList<>(); //intializing array list of bye
String s="";
System.out.println("****PRESENTING YOU OUR MAGIC PLAGIARISM TOOL****");
System.out.println();
System.out.println("==================================================");
System.out.println();
System.out.println("ENTER THE 1st FILE DATA");
String hello_txt=sc.nextLine();
hello_txt=hello_txt+" ";
System.out.println("ENTER THE 2nd FILE DATA");
String bye_txt=sc.nextLine();
bye_txt=bye_txt+" ";
System.out.println("YOUR OPTIONS ARE");
System.out.println("Option 1  : Matching Percentage");
System.out.println("Option 2  : Word count in Hello file");
System.out.println("Option 3  : Word Count in Bye File");
System.out.println("Option 4  : Most Frequent Word in Hello");
System.out.println("Option 5  : Most Frequent Word in Bye");
System.out.println("Option 6  : Smallest and Largest words in Hello file ");
System.out.println("Option 7  : Smallest and Largest words in Bye file");
System.out.println("Option 8  : Number of Words, Alphabets, Special Characters in Hello file");
System.out.println("Option 9  : Reading k number of words from first and last of File Bye");
System.out.println("Option 10 : Finding number of different words in File Bye");
System.out.println("Option 11 : Finding number of different words in File Hello");
System.out.println("Option 12 : Number of words with length k");
System.out.println("Option 13 : EXIT");
System.out.println("Please enter the number of times you wish to use Magic Plagiarism Tool");
int h=sc.nextInt();
for(int i=0;i<hello_txt.length();i++){ //storing the hello file in a map,array list
if(hello_txt.charAt(i)==' '){
hm.put(s,hm.getOrDefault(s,0)+1);
al.add(s);
s="";
c1++;

}
else{
s=s+hello_txt.charAt(i);
}
}
s="";
for(int i=0;i<bye_txt.length();i++){ //storing the bye file in a map,array list
if(bye_txt.charAt(i)==' '){
hm1.put(s,hm1.getOrDefault(s,0)+1);
bl.add(s);
s="";
c2++;
}
else{
s=s+bye_txt.charAt(i);
}
}
System.out.println("Please Enter the number from the given range [1-12]"); //user chooses option
while(h-- >0){
int ex=sc.nextInt();
Plagarism test=new Plagarism();
if(ex==13){
test.fexit();
break;
}
else{
switch(ex){
case 1: test.Matching_Percentage(hm,hm1);
break;
case 2: test.WordCountHello(c1);
break;
case 3: test.WordCountBye(c2);
break;
case 4: test. MostFrequentHello(hm);
break;
case 5: test.MostFrequentBye(hm1);
break;
case 6: test.displayHello(hm);
break;
case 7: test.displayBye(hm1);
break;
case 8: test.CountersHello(hello_txt);
break;
case 9: test.Reading(bl);
break;
case 10: test.Difference_Bye(al,bl);
break;
case 11: test.Difference_Hello(al,bl);
break;
case 12: test.MagicFigure(al,bl);
break;
default: System.out.println("CHOOSE A VALID OPTION");
}}
System.out.println();
System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
System.out.println();
}

}
}
class Plagarism{ //Class for using all the application functions
Scanner sc=new Scanner(System.in);
  double Matching_Percentage(HashMap<String,Integer> hm,HashMap<String,Integer> hm1){ //option 1
double c=0;
double per=0;
for(String y: hm1.keySet()){
for(String z:hm.keySet()){
if(y.equals(z)){
c++;

}
}
}
per=((c)/(hm1.size()))*100;
System.out.println("Percentage of matching elements is : "+per);
return per;
}

void WordCountHello(int c1){ //option 2
System.out.println("Word Count of text in Hello File is : "+c1);
}
void WordCountBye(int c2){ //option 3
System.out.println("Word Count of text in Bye File is : "+c2);
}
void MostFrequentHello(HashMap<String, Integer> hm){ //option 4
int count=0,max=0;
String ans="";
for(String y: hm.keySet()){
if(max<hm.get(y)){
max=hm.get(y);
ans=y;
}
}
System.out.println("Most Frequently Repeated Word in Hello file is : "+ans);
}
void MostFrequentBye(HashMap<String, Integer> hm){ //option 5
int count=0,max=0;
String ans="";
for(String y: hm.keySet()){
if(max<hm.get(y)){
max=hm.get(y);
ans=y;
}
}
System.out.println("Most Frequently Repeated Word in Bye file is : "+ans);
}

void displayHello(HashMap<String, Integer> hm){ //option 6
String sm="",lar="";
int max=0,min=9999999;
for(String y:hm.keySet()){
if(y.length()>max){
max=y.length();
lar=y;
}
if(y.length()<min){
min=y.length();
sm=y;
}
}
System.out.println("Smallest String in Hello File is: "+sm);
System.out.println("Largest String in Hello File is: "+lar);
}
void displayBye(HashMap<String, Integer> hm){ //option 7
String sm="",lar="";
int max=0,min=9999999;
for(String y:hm.keySet()){
if(y.length()>max){
max=y.length();
lar=y;
}
if(y.length()<min){
min=y.length();
sm=y;
}
}
System.out.println("Smallest String in Bye file is: "+sm);
System.out.println("Largest String in Bye File is: "+lar);
}
void CountersHello(String a){ //option 8
int words=0,alpha=0,special=0;
for(int i=0;i<a.length();i++){
char d=a.charAt(i);
if((d>='A' && d<='Z') || (d>='a' && d<='z')){
alpha++;
}
else if(d==' '){
words++;
}
else if(d!=' '){
special++;
}
}
System.out.println("HELLO FILE");
System.out.println("Number of Words  : "+words);
System.out.println("Number of Alphabets  : "+alpha);

System.out.println("Number of special  : "+special);
}
void Reading(ArrayList<String> bl){ //option 9
System.out.println("Enter k value :");
int k=sc.nextInt();
if(k>bl.size()){
System.out.println("enter k in the given range [0-"+(bl.size()-1)+"]");
Reading(bl);
}
else{
System.out.println("The First "+k+" elements in Bye File : ");
for(int i=0;i<k;i++){
System.out.print(bl.get(i)+" ");
}
System.out.println();
System.out.println("The Last "+k+" elements in Bye File : ");
for(int i=bl.size()-1;i>=0 && k>0; k--,i--){
System.out.print(bl.get(i)+" ");
}}
System.out.println();
}
void Difference_Hello(ArrayList<String> al,ArrayList<String> bl){ //option 10
int word=0,i,j,c=0;
for(i=0;i<al.size();i++){
c=0;
for(j=0;j<bl.size();j++){
if(al.get(i).equals(bl.get(j))){
c++;
}
}
if(c==0){
word++;
}
}
System.out.print("The count of the words that differ in Hello from Bye :");
System.out.println(word);
}
void Difference_Bye(ArrayList<String> al,ArrayList<String> bl){ //option 11
int word=0,c=0;
for(int i=0;i<bl.size();i++){
c=0;
for(int j=0;j<al.size();j++){
if(bl.get(i).equals(al.get(j))){
c++;
}
}
if(c==0){
word++;
}
}
System.out.print("The count of the words that differ in Bye from Hello :");
System.out.println(word);

}
  void MagicFigure(ArrayList<String> al,ArrayList<String> bl){ //option 12
System.out.println("Enter k Value :");
int i,c=0,k=sc.nextInt();
for(i=0;i<al.size();i++){
String h=al.get(i);
if(h.length()==k){
c++;
}
}
System.out.println("The count of words with length "+k+" is :"+c);
c=0;
System.out.println();
for(i=0;i<bl.size();i++){
String h=bl.get(i);
if(h.length()==k){
c++;
}
}
System.out.println("The count of words with length "+k+" is :"+c);
System.out.println();
}

void fexit(){ //option 13
System.out.println("YOU HAVE EXITED THE APPLICATION ");
System.out.println("THANK YOU");
}
}   
