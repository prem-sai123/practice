import 'dart:io';

void main(List<String> args) {
  print("Enter the Length of the list : ");
  int? num = int.parse(stdin.readLineSync()!);
  List<String> firstList = [];
  for (int i = 0; i < num; i++) {
    print("Enter the element $i: ");
    String element = stdin.readLineSync()!;
    firstList.add(element);
  }
  List<String> secondList = [...firstList];
  print(secondList);
}
