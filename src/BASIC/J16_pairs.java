package BASIC;
class pair<F,S>
{
    private F First;
    private S Second;
    public pair(F first,S second)
    {
        this.First=first;
        this.Second=second;
    }
    public F first()
    {
        return First;
    }
    public S second()
    {
        return Second;
    }
}
class J16_pairs
{
    public static void main(String[] args) {
        pair<Integer, Integer> p1 = new pair<>(23, 45);
        System.out.println("P1.first = "+p1.first());
        System.out.println("p1.second = "+p1.second());
    }
}
