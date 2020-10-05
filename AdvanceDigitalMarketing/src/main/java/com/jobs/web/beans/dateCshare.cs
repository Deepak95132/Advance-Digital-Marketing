using System;
using System.Globalization;
using System.Threading;
class Program
{
    static void Main()
    {
        
        CultureInfo us = new CultureInfo(Thread.CurrentThread.CurrentCulture.Name);
    string shortUsDateFormatString = us.DateTimeFormat.ShortDatePattern;
    Console.WriteLine(shortUsDateFormatString);
    Console.WriteLine(Thread.CurrentThread.CurrentCulture.Name);
    }
}