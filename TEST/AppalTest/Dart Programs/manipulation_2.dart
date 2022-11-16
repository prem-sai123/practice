import 'dart:io';

void main(List<String> args) {
  print("Enter the String : ");
  String? complexString = (stdin.readLineSync()!);
  String res = complexString.replaceAll(new RegExp(r"\d"), "");

  print(res);
}
