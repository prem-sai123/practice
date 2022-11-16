import 'dart:io';

void main(List<String> args) {
  print("Enter the length of array : ");
  int? arrLeng = int.parse(stdin.readLineSync()!);
  print("Enter the name of your Object ");
  String? name = stdin.readLineSync()!;
  List<String> data = [];
  for (int i = 0; i < arrLeng; i++) {
    print("Enter the name : ");
    String? value = stdin.readLineSync()!;
    data.add(value);
  }
  print(data);
}
