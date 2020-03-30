//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.ListAdapter;
//
//import com.example.tigrisapp.R;
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.firebase.database.DataSnapshot;
//import com.google.firebase.database.DatabaseError;
//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;
//import com.google.firebase.database.ValueEventListener;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class NavHomeFragment extends Fragment {
//
//
//    TextView editTextName,getEditTextSalt;
//    Button buttonConnect;
//    FirebaseDatabase firebaseDatabase;
//    String username;
//    String usersalt;
//    ListView product_list;
//    List<ProductInformation> productInformation;
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View rootView =  inflater.inflate(R.layout.fragment_home,container,false);
//
////        editTextName = rootView.findViewById(R.id.editTex);
////        buttonConnect = rootView.findViewById(R.id.button_post);
////        product_list = rootView.findViewById(R.id.post_list);
////        bottomNavigationView = findViewById(R.id.navigationView);
//
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Posts");
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//
//                productInformation.clear();
//
//                for (DataSnapshot tutorSnapshot : dataSnapshot.getChildren()) {
//
//                    ProductInformation user = tutorSnapshot.getValue(ProductInformation.class);
//
//                    productInformation.add(user);
//                }
//                ProductListAdapter adapter = new ProductListAdapter(getActivity(),(ArrayList<ProductInformation>) productInformation);
//                product_list.setAdapter(adapter);
//
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });
//
//
//        return rootView;
//    }
//}
