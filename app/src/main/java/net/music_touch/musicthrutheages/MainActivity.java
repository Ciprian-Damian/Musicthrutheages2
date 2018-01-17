package net.music_touch.musicthrutheages;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.io.IOException;
public class MainActivity extends Activity {

    Button buttonStop,buttonStart ;
    String AudioURL;
    MediaPlayer mediaplayer;

  //  private void displayMessage(String message) {
    //      TextView orderSummaryTextView = (TextView) findViewById(R.id.mesaj);
    //      orderSummaryTextView.setText(message);
  //  }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        EditText num = (EditText) findViewById(R.id.name);
        String hasnume = num.getText().toString();


        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.teen:
                if (checked){ AudioURL = "https://www.music-touch.net/media/Music/Justin_Bieber_-_What_Do_You_Mean.mp3";
                 ImageView foto=(ImageView) findViewById(R.id.imagine);

                   foto.setImageResource(R.drawable.bieber);
                    Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
                    foto.startAnimation(myFadeInAnimation);
                    final TextView mesaj = (TextView) findViewById(R.id.scroltext);
                    mesaj.setText("Hi " + hasnume + "!" + " You probably like Justin Bieber");

                    ValueAnimator valueAnimator = ValueAnimator.ofFloat(1f, 0f);
                    valueAnimator.setDuration(8000);
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animation) {
                            float alpha = (float) animation.getAnimatedValue();
                            mesaj.setAlpha(alpha);
                        }
                    });
                    valueAnimator.start();
                    }

                mediaplayer = new MediaPlayer();
                mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

                try {
                    if(mediaplayer.isPlaying()){

                        mediaplayer.reset();
                        mediaplayer.stop();
                    }


                    mediaplayer.setDataSource(AudioURL);
                    mediaplayer.prepare();

                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                mediaplayer.start();


                // Pirates are the best
                break;
            case R.id.young:
                if (checked){ AudioURL = "https://www.music-touch.net/media/Music/DJ_Tiesto_-_Welcome_To_Ibiza.mp3";
                    ImageView foto=(ImageView) findViewById(R.id.imagine);

                    foto.setImageResource(R.drawable.tiesto);
                    Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
                    foto.startAnimation(myFadeInAnimation);
                    final TextView mesaj = (TextView) findViewById(R.id.scroltext);
                    mesaj.setText("Hi " + hasnume + "!" + " You probably liked Tiesto");

                    ValueAnimator valueAnimator = ValueAnimator.ofFloat(1f, 0f);
                    valueAnimator.setDuration(8000);
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animation) {
                            float alpha = (float) animation.getAnimatedValue();
                            mesaj.setAlpha(alpha);
                        }
                    });
                    valueAnimator.start();

                }


                mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

                try {

                    if(mediaplayer.isPlaying()){
                        mediaplayer.stop();
                        mediaplayer.reset();

                    }



                    mediaplayer.setDataSource(AudioURL);
                    mediaplayer.prepare();

                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                mediaplayer.start();






                // Ninjas rule
                break;
            case R.id.adult:
                if (checked){ AudioURL = "https://www.music-touch.net/media/Music/Queen_-_Radio_Ga_Ga.mp3";
                    ImageView foto=(ImageView) findViewById(R.id.imagine);

                    foto.setImageResource(R.drawable.queen);
                    Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
                    foto.startAnimation(myFadeInAnimation);
                    final TextView mesaj = (TextView) findViewById(R.id.scroltext);
                    mesaj.setText("Hi " + hasnume + "!" +  " Queen is probably the best rock band that existed and I'm sure you loved their music");

                    ValueAnimator valueAnimator = ValueAnimator.ofFloat(1f, 0f);
                    valueAnimator.setDuration(8000);
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animation) {
                            float alpha = (float) animation.getAnimatedValue();
                            mesaj.setAlpha(alpha);
                        }
                    });
                    valueAnimator.start();
                }


                mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

                try {
                    if(mediaplayer.isPlaying()){
                        mediaplayer.stop();
                        mediaplayer.reset();

                    }


                    mediaplayer.setDataSource(AudioURL);
                    mediaplayer.prepare();

                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                mediaplayer.start();

                // Ninjas rule
                break;

            case R.id.old:
                if (checked){  AudioURL = "https://www.music-touch.net/media/Music/Bee_Gees_-_Stayin_Alive.mp3";

                    ImageView foto=(ImageView) findViewById(R.id.imagine);

                    foto.setImageResource(R.drawable.disco);
                    Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
                    foto.startAnimation(myFadeInAnimation);
                    final TextView mesaj = (TextView) findViewById(R.id.scroltext);
                    mesaj.setText("Hi " + hasnume  + "!"+ " Sure thing you've danced on this kind of music");


                    ValueAnimator valueAnimator = ValueAnimator.ofFloat(1f, 0f);
                    valueAnimator.setDuration(8000);
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animation) {
                            float alpha = (float) animation.getAnimatedValue();
                            mesaj.setAlpha(alpha);
                        }
                    });
                    valueAnimator.start();
                    //    EditText num = (EditText) findViewById(R.id.name);
                    //     String hasnume = num.getText().toString();

                    //    //    displayMessage(hasnume);
                    //  new Timer().schedule(new TimerTask(){
                        //       public void run() {
                        //           //            MainActivity.this.runOnUiThread(new Runnable() {
                        //                public void run() {
                                    //                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                        //             }
                            //            });
                        //      }
                                             //   }, 4000);
                           }


                mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

                try {
                    if(mediaplayer.isPlaying()){
                        mediaplayer.stop();
                        mediaplayer.reset();

                    }


                    mediaplayer.setDataSource(AudioURL);
                    mediaplayer.prepare();

                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                mediaplayer.start();

                // Ninjas rule
                break;
            case R.id.oldest:
                if (checked){ AudioURL = "https://www.music-touch.net/media/Music/The_Beatles_-_Hello_Goodbye.mp3";
                    ImageView foto=(ImageView) findViewById(R.id.imagine);

                    foto.setImageResource(R.drawable.beatles);
                    Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
                    foto.startAnimation(myFadeInAnimation);
                    final TextView mesaj = (TextView) findViewById(R.id.scroltext);
                    mesaj.setText("HI " + hasnume + "!"+ " Say hello to the Beatles");

                    ValueAnimator valueAnimator = ValueAnimator.ofFloat(1f, 0f);
                    valueAnimator.setDuration(8000);
                    valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator animation) {
                            float alpha = (float) animation.getAnimatedValue();
                            mesaj.setAlpha(alpha);
                        }
                    });
                    valueAnimator.start();
                    }


                mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

                try {
                    if(mediaplayer.isPlaying()){
                        mediaplayer.stop();
                        mediaplayer.reset();

                    }


                    mediaplayer.setDataSource(AudioURL);
                    mediaplayer.prepare();

                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                mediaplayer.start();

                // Ninjas rule
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.container).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                return true;
            }
        });

        buttonStop = (Button)findViewById(R.id.button2);


        buttonStop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub


                mediaplayer.stop();


            }
        });
    }
}








