package ObjektLang;

import java.util.Objects;

public class SpecialCircus extends Circus{
    private boolean hasFlag;
    public SpecialCircus(){
        super();
        hasFlag = false;
    }

    public SpecialCircus(String name, int id, boolean hasFlag) {
        super(name, id);
        this.hasFlag = hasFlag;
    }

    public boolean isHasFlag() {
        return hasFlag;
    }

    public void setHasFlag(boolean hasFlag) {
        this.hasFlag = hasFlag;
    }

    @Override
    public String toString() {
        return "SpecialCircus{" +
                "hasFlag=" + hasFlag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialCircus that = (SpecialCircus) o;
        return isHasFlag() == that.isHasFlag();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isHasFlag());
    }
}
