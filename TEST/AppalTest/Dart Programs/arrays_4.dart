import 'dart:io';

void main(List<String> args) {
  print("Enter the Length of the list : ");
  int? num = int.parse(stdin.readLineSync()!);
  print("Enter the index : ");
  int? index = int.parse(stdin.readLineSync()!);
  List<String> data = [];
  for (int i = 0; i < num; i++) {
    print("Enter the element $i: ");
    String element = stdin.readLineSync()!;
    data.add(element);
  }
  if (index < data.length) {
    print('Element at $index is ${data[index]}');
  } else {
    print("Invalid Index");
  }
}
