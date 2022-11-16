import 'dart:io';

void main(List<String> args) {
  print("Enter the First number : ");
  int? num1 = int.parse(stdin.readLineSync()!);
  print("Enter the Second number : ");
  int? num2 = int.parse(stdin.readLineSync()!);
  if (num1 != num2) {
    print("Both are not equal.");
  } else {
    print("Both are equal.");
  }
}
