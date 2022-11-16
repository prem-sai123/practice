import 'dart:io';

void main(List<String> args) {
  print("Enter the String 1 : ");
  String? inp1 = (stdin.readLineSync()!);
  print("Enter the key String to check : ");
  String? inp2 = (stdin.readLineSync()!);
  print(inp1.contains(inp2));
}