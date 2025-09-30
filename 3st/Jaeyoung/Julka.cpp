#include <iostream>

#include <string>

#include <algorithm>

using namespace std;

string getResultWithoutUnnecessaryZeros(string result)

{

	int firstNonZeroIdx = result.size();

	for (int i = 0; i < result.size(); i++)
	{
		if (result[i] != '0')
		{
			firstNonZeroIdx = i;

			break;
		}
	}

	if (firstNonZeroIdx == result.size())
	{

		return "0";
	}

	return result.substr(firstNonZeroIdx);
}

string add(string s1, string s2)
{

	string result(max(s1.size(), s2.size()), '0');

	bool carry = false;

	for (int i = 0; i < result.size(); i++)

	{

		int temp = carry;

		carry = false;

		if (i < s1.size())

		{

			temp += s1[s1.size() - i - 1] - '0';
		}

		if (i < s2.size())

		{

			temp += s2[s2.size() - i - 1] - '0';
		}

		if (temp >= 10)

		{

			carry = true;

			temp -= 10;
		}

		result[result.size() - i - 1] = temp + '0';
	}

	if (carry)

	{

		result.insert(result.begin(), '1');
	}

	return getResultWithoutUnnecessaryZeros(result);
}

bool isFormerBiggerThanLatter(string s1, string s2)

{

	if (s1.size() != s2.size())

	{

		return s1.size() > s2.size();
	}

	for (int i = 0; i < s1.length(); i++)

	{

		if (s1[i] == s2[i])

		{

			continue;
		}

		return s1[i] > s2[i];
	}

	return true;
}

string subtract(string s1, string s2)

{

	if (isFormerBiggerThanLatter(s1, s2) == false)

	{

		swap(s1, s2);
	}

	reverse(s1.begin(), s1.end());

	reverse(s2.begin(), s2.end());

	string result = s1;

	int carry = 0;

	for (int i = 0; i < result.size(); i++)

	{

		int tempCarry = carry;

		carry = 0;

		int temp = (s1[i] - '0') - tempCarry;

		if (temp < 0)

		{

			carry = 1;

			temp += 10;
		}

		if (i < s2.size())

		{

			temp -= (s2[i] - '0');

			if (temp < 0)

			{

				carry = 1;

				temp += 10;
			}
		}

		result[i] = temp + '0';
	}

	if (carry)

	{

		int lastDigit = result[result.size() - 1];

		lastDigit--;

		result[result.size() - 1] = lastDigit + '0';
	}

	reverse(result.begin(), result.end());

	return getResultWithoutUnnecessaryZeros(result);
}

string multiply(string s1, string s2)

{

	string result = "0";

	for (int i = 0; i < s2.size(); i++)

	{

		string line(s1);

		int carry = 0;

		for (int j = s1.size() - 1; j >= 0; j--)

		{

			int temp = carry;

			carry = 0;

			temp += (s1[j] - '0') * (s2[s2.size() - (i + 1)] - '0');

			if (temp >= 10)

			{

				carry = temp / 10;

				temp %= 10;
			}

			line[j] = temp + '0';
		}

		if (carry > 0)

		{

			line.insert(line.begin(), carry + '0');
		}

		line += string(i, '0');

		result = add(result, line);
	}

	return getResultWithoutUnnecessaryZeros(result);
}

string divideByTwo(string s)

{

	string result;

	int idx = 0;

	int num = 0;

	int quotient = 0;

	bool flag = false;

	while (idx != s.length())

	{

		int num = s[idx] - '0';

		switch (num)

		{

		case 0:

			result += '0';

			idx++;

			break;

		case 1:

			num = num * 10 + s[idx + 1] - '0';

			quotient = num / 2;

			if (flag == false)

			{

				result += '0';
			}

			else

			{

				flag = false;
			}

			result += quotient + '0';

			num -= (quotient * 2);

			s[++idx] = num + '0';

			if (num % 2 == 0)

			{

				idx++;
			}

			else

			{

				flag = true;
			}

			break;

		default:

			quotient = num / 2;

			result += (num / 2) + '0';

			num -= quotient * 2;

			s[idx] = num + '0';

			if (s[idx] == '0')

			{

				idx++;
			}

			else

			{

				flag = true;
			}
		}
	}

	return getResultWithoutUnnecessaryZeros(result);
}

int main(void)

{

	ios_base::sync_with_stdio(0);

	cin.tie(0);

	string total, diff;

	cin >> total >> diff;

	string totalMinusDiff = subtract(total, diff);

	string secondAnswer = divideByTwo(totalMinusDiff);

	string firstAnswer = add(secondAnswer, diff);

	cout << firstAnswer << "\n"
		 << secondAnswer << "\n";

	return 0;
}