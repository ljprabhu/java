import java.util.Scanner;
class NewIsomorphic {
public static void main(String[] args) {
String str1;
String str2;
String str;
String[] input = new String[2]; 
Scanner scan = new Scanner(System.in);
input= scan.nextLine().split(" ");
str1= input[0];
str2= input[1];
String res = NewIsomorphic.checkIsomorphic(str1,str2);
System.out.println(res);
}
static String checkIsomorphic(String str1, String str2) {
int length = str1.length();
/* length of both strings must be same */
if (length != str2.length()) {
return "no";
}
// To mark visited characters in str2
char visited[] = new char[26];
for (int i = 0; i < visited.length; i++) {
visited[i] = '#';
}
char[] strArr1 = str1.toCharArray();
char[] strArr2 = str2.toCharArray();
// Process all characters one by on
for (int i = 0; i<length; i++) {
char ch = visited[strArr1[i]-'a'];
if(ch=='#') {
visited[strArr1[i]-'a'] = strArr2[i];
} else if (ch != strArr2[i]) {
return "no"; 
}
}
return "yes";
}
}
