package This06;

public class Button {

    OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.OnClick();
    }

    interface OnClickListener {
        void OnClick();
    }
}
