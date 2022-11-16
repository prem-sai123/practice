import 'dart:io';

void main(List<String> args) {
  print("Enter the month number : ");
  int? month = int.parse(stdin.readLineSync()!);
  switch (month) {
    case 1:
			print("$month st month have 31 days");
			break;
		case 2:
			print("$month nd month can have 28/29 days");
			break;
		case 3:
			print("$month rd month have 31 days");
			break;
		case 4:
			print("$month th month have 30 days");
			break;
		case 5:
			print("$month th month have 31 days");
			break;
		case 6:
			print("$month th month have 30 days");
			break;
		case 7:
			print("$month th month have 31 days");
			break;
		case 8:
			print("$month th month have 31 days");
			break;
		case 9:
			print("$month th month have 30 days");
			break;
		case 10:
			print("$month th month have 31 days");
			break;
		case 11:
			print("$month th month have 30 days");
			break;
		case 12:
			print("$month th month have 31 days");
			break;
		default:
			print("Please enter month number between 1-12");
  }
}