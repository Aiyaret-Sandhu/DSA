package Practice;

public class Rational {
        private long numerator;
        private long denominator;

        public Rational(long sum, long product){
            this.numerator = sum;
            this.denominator = product;
        }

        public long getNumerator() {
            return this.numerator;
        }

        public long getDenominator() {
            return this.denominator;
        }

        public long gcd(long p, long q){
            if (q == 0) return p;
            return gcd(q,p%q);
        }

        public long getGcd() {
            return gcd(this.numerator, this.denominator);
        }

        public Rational getPrimal() {
            long d = gcd(getNumerator(), getDenominator());
            long num = (long) getNumerator()/d;
            long den = (long) getDenominator()/d;
            return new Rational(num, den);
        }

        public Rational plus(Rational b){
            Rational d = this.getPrimal();
            Rational c = b.getPrimal();
            long product = c.getDenominator() * this.denominator;
            long sum = d.getDenominator()*c.getNumerator() + d.getNumerator() * c.getDenominator();

            return new Rational(sum, product);
        }

        public Rational minus(Rational b){
            Rational d = this.getPrimal();
            Rational c = b.getPrimal();
            long product = c.getDenominator() * d.getDenominator();
            long sum = d.getDenominator()*c.getNumerator() - d.getNumerator() * c.getDenominator();

            return new Rational(sum, product);
        }
        
        public Rational times(Rational b) {
            Rational c = this.getPrimal();
            Rational d = b.getPrimal();
            Rational e = new Rational(c.getNumerator()*d.getNumerator(), c.getDenominator()*d.getDenominator());
            return e.getPrimal();
        }

        public Rational divides(Rational b) {
            Rational c = this.getPrimal();
            Rational d = b.getPrimal();
            Rational e = new Rational(c.getNumerator()*d.getDenominator(), c.getDenominator()*d.getNumerator());
            return e.getPrimal();
        }

        public boolean equals(Rational b) {
            if (this == b) {
                return true;
            }

            if (!(b instanceof Rational)) {
                return false;
            }

            Rational c = b;
            if (c.getNumerator() == b.getNumerator() && c.getDenominator() == b.getDenominator())
                return true;
            
            return false;
        }


        public String toString() {
            return this.numerator + "/" + this.denominator;
        }
        
}

