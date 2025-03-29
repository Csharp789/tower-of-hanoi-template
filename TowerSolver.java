
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(model.getHeight(), 0, 2, 1);
    }

    private void solve(int n, int source, int destination, int auxiliary){
        if (n == 1) {
            model.move(source, destination);
            return;
        }
        solve(n - 1, source, auxiliary, destination);
        model.move(source, destination);
        solve(n - 1, auxiliary, destination, source);

    }
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //

}
