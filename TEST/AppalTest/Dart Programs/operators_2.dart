import 'dart:io';

void main(List<String> args) {
  print("Enter the First string : ");
  String? str1 = stdin.readLineSync()!;
  print("Enter the Second string : ");
  String? str2 = stdin.readLineSync()!;
  if (str1.length == str2.length) {
    print("Both strings are equal.");
  } else if (str1.length > str2.length) {
    print("${str1} is greater than ${str2}");
  } else {
    print("${str2} is greater than ${str1}");
  }
}
