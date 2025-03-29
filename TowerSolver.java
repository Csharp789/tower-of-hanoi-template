
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

    }
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //

}
