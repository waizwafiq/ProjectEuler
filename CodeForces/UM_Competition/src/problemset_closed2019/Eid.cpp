
// C++ program to find LCM of n elements
#include <bits/stdc++.h>
using namespace std;
 
typedef long long int ll;
 
// Utility function to find
// GCD of 'a' and 'b'
long gcd(long a, long b)
{
    if (b == 0)
        return a;
    return gcd(b, a % b);
}
 
// Returns LCM of array elements
ll findlcm(long arr[], int n)
{
    // Initialize result
    ll ans = arr[0];
 
    // ans contains LCM of arr[0], ..arr[i]
    // after i'th iteration,
    for (int i = 1; i < n; i++)
        ans = (((arr[i] * ans)) / (gcd(arr[i], ans)));

    return ans;
}
 
// Driver Code
int main()
{
	int T;
	cin >> T;
	
	for(int i=0; i < T; i++){
		int n;
		cin >> n;
		long races[n];
		for(int j=0; j < n; j++){
			cin >> races[j];
		}
		
		cout << findlcm(races, sizeof(races) / sizeof(races[0])) << endl;
	}
    return 0;
}
