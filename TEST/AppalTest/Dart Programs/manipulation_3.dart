import 'dart:io';

void main(List<String> args) {
  print("Enter the String 1 : ");
  String? inp1 = (stdin.readLineSync()!);
  print("Enter the String 2 : ");
  String? inp2 = (stdin.readLineSync()!);
  print('LENGTH OF $inp1 is ${inp1.length}');
  print('LENGTH OF $inp2 is ${inp2.length}');
  if (inp1.length > inp2.length) {
    print('Difference is ${inp1.length - inp2.length}');
  } else {
    print('Difference is ${inp2.length - inp1.length}');
  }
}
