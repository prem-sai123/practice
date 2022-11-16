import 'dart:io';

void main(List<String> args) {
  print("Enter the String : ");
  String? userInp = (stdin.readLineSync()!);
  List<String> data = userInp.split(" ");
  print(data);
}
