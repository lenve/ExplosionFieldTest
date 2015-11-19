package lenve.viewexplosion;

import tyrantgit.explosionfield.ExplosionField;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

	private ExplosionField explosionField;
	private ImageView iv1, iv2, iv3, iv4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		iv1 = (ImageView) this.findViewById(R.id.iv1);
		iv2 = (ImageView) this.findViewById(R.id.iv2);
		iv3 = (ImageView) this.findViewById(R.id.iv3);
		iv4 = (ImageView) this.findViewById(R.id.iv4);
		explosionField = ExplosionField.attach2Window(this);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.iv1:
			explosionField.explode(iv1);
			iv1.setVisibility(View.INVISIBLE);
			break;
		case R.id.iv2:
			explosionField.explode(iv2);
			iv2.setVisibility(View.INVISIBLE);
			break;
		case R.id.iv3:
			explosionField.explode(iv3);
			iv3.setVisibility(View.INVISIBLE);
			break;
		case R.id.iv4:
			explosionField.explode(iv4);
			iv4.setVisibility(View.INVISIBLE);
			break;
		}
	}
}
