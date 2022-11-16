import 'dart:io';

void main(List<String> args) {
  print("Enter the Divisor : ");
  int? num1 = int.parse(stdin.readLineSync()!);
  print("Enter the Dividend : ");
  int? num2 = int.parse(stdin.readLineSync()!);
  print('Quotient is ${num2 / num1}');
  print('Remainder is ${num2 % num1}');
  print('--------------');
  print('Quotient in Int ${num2~/num1}');
  print('Remainder in Int ${(num2 % num1).toInt()}');
}
