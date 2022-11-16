import 'dart:io';

void main(List<String> args) {
  print("Enter the String : ");
  String? inp1 = (stdin.readLineSync()!);
  String res = inp1.padLeft(15, 'X');
  print(res);
}
