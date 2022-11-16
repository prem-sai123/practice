import 'dart:io';

void main(List<String> args) {
  print("Enter the length of list : ");
  int? listLength = int.parse(stdin.readLineSync()!);

  print("Enter the string to filters the countries : ");
  String? filteredCountry = stdin.readLineSync()!;

  List<String> countries = [];
  for (int i = 0; i < listLength; i++) {
    print("Enter the Country : ");
    String? country = stdin.readLineSync()!;
    countries.add(country);
  }
  countries.retainWhere((element) {
    return element.toLowerCase().contains(filteredCountry.toLowerCase());
  });
  print(countries);
}
