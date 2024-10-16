package Designs.Desgin_Pen;

public class PenFActory {
    Pen pen = null;

    public static Pen getPen(PenType type) {
        Pen pen =null;
        if(type.equals(PenType.BALLPEN)) {
            pen = new BallPen();
        }
        else if (type.equals(PenType.FOUNTAINPEN)) {
            pen = new FountainPen();
        } else if (type.equals(PenType.BUTTERFLOWPEN)) {
            pen = new ButterFlowPen();
        } else if (type.equals(PenType.TRIMAXPEN)) {
            pen = new TrimaxPen();
        }

        return pen;

    }
}
