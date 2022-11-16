import 'dart:io';
import 'dart:math';

void main(List<String> args) {
  print("Enter the First number : ");
  int? num1 = int.parse(stdin.readLineSync()!);
  print("Enter the Second number : ");
  int? num2 = int.parse(stdin.readLineSync()!);
  print("Maximum Number is : ${max(num1, num2)}");
}
