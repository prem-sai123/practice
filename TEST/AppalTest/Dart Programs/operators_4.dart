import 'dart:io';

void main(List<String> args) {
  print("Enter the number : ");
  int? num1 = int.parse(stdin.readLineSync()!);
  print('Here i am using % to decide whether the given number is even or odd');
  if(num1 %2==0){
    print('EVEN');
  } else {
    print('ODD');
  }
}
