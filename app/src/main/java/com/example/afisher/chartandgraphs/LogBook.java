package com.example.afisher.chartandgraphs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import de.codecrafters.tableview.TableView;
import de.codecrafters.tableview.toolkit.SimpleTableDataAdapter;

public class LogBook extends AppCompatActivity {

//    private static final String[][] DATA_TO_SHOW = { { "This", "is", "a", "test" },
//            { "and", "a", "second", "test" } };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_book);

        String[][] DATA_TO_SHOW = { { "# of Readings", "13%\t5", "32%\t12", "13%\t5", "18%\t7","8%\t3","8%\t3","3%\t1","5%\t2","100%\t38" },
            { "Maximum\tmg/dL", "238", "208", "292","189","109","133","189","236","292" } };




        TableView<String[]> tableView = (TableView<String[]>) findViewById(R.id.logBookTable);
        tableView.setDataAdapter(new SimpleTableDataAdapter(this, DATA_TO_SHOW));


    }


//    public class LogBookAdapter extends TableDataAdapter<String>{
//
//        public LogBookAdapter(Context context, List<String> data){
//            super(context,data);
//        }
//
//        @Override
//        public View getCellView(int rowIndex, int columnIndex, ViewGroup parentView) {
//            String s = getRowData(rowIndex);
//            View renderView = null;
//
//            switch (columnIndex){
//                case 0:
//                    break;
//                case 0:
//                    break;
//                case 0:
//                    break;
//
//            }
//
//            return null;
//        }
//    }
}
