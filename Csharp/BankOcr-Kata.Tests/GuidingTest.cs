﻿using Xunit;

namespace Kata.Tests
{
    public class GuidingTest
    {
        [Fact]
        public void ShouldParseOcrLine()
        {
            // TODO failing test, start here
            // guiding test from outside in as starting point.
            // a) ignore this test
            // b) or stub everything in the BankOcr constructor
            // c) or let it be red until the end

            var bankOcr = new BankOcr();

            var accountNumbers = bankOcr.Parse(Input.AllDigits());

            Assert.Single(accountNumbers);
            Assert.Equal(new AccountNumber("123456789"), accountNumbers[0]);
        }

    }
}
