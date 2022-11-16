import 'dart:io';

void main(List<String> args) {
  print("Enter the Alphabet : ");
  String? alphabet = stdin.readLineSync()!;
  if (['a', 'e', 'i', 'o', 'u'].contains(alphabet.toLowerCase())) {
    print('It\'s a vowel');
  } else {
    print('It\'s a consonant');
  }
}
