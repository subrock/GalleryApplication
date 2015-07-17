/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.displayingbitmaps.provider;

/**
 * Some simple test data to use for this sample app.
 */
public class Images {

    /**
     * This are PicasaWeb URLs and could potentially change. Ideally the PicasaWeb API should be
     * used to fetch the URLs.
     *
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageUrls = new String[] {
            "http://jerome.lendmyvoice.org/images/IMG000002.jpg",
            "http://jerome.lendmyvoice.org/images/IMG000003.jpg",
            "http://jerome.lendmyvoice.org/images/IMG000004.jpg",
            "http://52.26.27.83/SchroederLife/008-04-2003.jpg",
            "http://52.26.27.83/SchroederLife/01-01-1972.jpg",
            "http://52.26.27.83/SchroederLife/01-01-2005.jpg",
            "http://52.26.27.83/SchroederLife/01-04-2003.jpg",
            "http://52.26.27.83/SchroederLife/02-02-2010.2.jpg",
            "http://52.26.27.83/SchroederLife/02-02-2010.jpg",
            "http://52.26.27.83/SchroederLife/02-03-2006.jpg",
            "http://52.26.27.83/SchroederLife/02-05-2004.jpg",
            "http://52.26.27.83/SchroederLife/02-05-2009.2.jpg",
            "http://52.26.27.83/SchroederLife/02-05-2009.jpg",
            "http://52.26.27.83/SchroederLife/02-19-2006.2.jpg",
            "http://52.26.27.83/SchroederLife/02-19-2006.3.jpg",
            "http://52.26.27.83/SchroederLife/02-19-2006.jpg",
            "http://52.26.27.83/SchroederLife/02-22-2010.jpg",
            "http://52.26.27.83/SchroederLife/03-12-2003.jpg",
            "http://52.26.27.83/SchroederLife/04-24-2004.jpg",
            "http://52.26.27.83/SchroederLife/04-25-2009.jpg",
            "http://52.26.27.83/SchroederLife/05-03-2013.JPG",
            "http://52.26.27.83/SchroederLife/05-26-2000.jpg",
            "http://52.26.27.83/SchroederLife/06-04-2014.jpg",
            "http://52.26.27.83/SchroederLife/06-10-2013.jpg",
            "http://52.26.27.83/SchroederLife/06-10-2014.jpg",
            "http://52.26.27.83/SchroederLife/06-22-2011.jpg",
            "http://52.26.27.83/SchroederLife/07-04-2011.2.jpg",
            "http://52.26.27.83/SchroederLife/07-04-2011.jpg",
            "http://52.26.27.83/SchroederLife/07-16-2010.jpg",
            "http://52.26.27.83/SchroederLife/08-13-2004.2.jpg",
            "http://52.26.27.83/SchroederLife/08-13-2004.jpg",
            "http://52.26.27.83/SchroederLife/09-02-2010.jpg",
            "http://52.26.27.83/SchroederLife/09-07-2011.jpg",
            "http://52.26.27.83/SchroederLife/09-11-2011.jpg",
            "http://52.26.27.83/SchroederLife/09-22-2004.jpg",
            "http://52.26.27.83/SchroederLife/10-06-2011.jpg",
            "http://52.26.27.83/SchroederLife/10-11-2003.jpg",
            "http://52.26.27.83/SchroederLife/10-16-2011.jpg",
            "http://52.26.27.83/SchroederLife/10-19-2010.jpg",
            "http://52.26.27.83/SchroederLife/10-26-2011.jpg",
            "http://52.26.27.83/SchroederLife/12-09-1999.jpg",
            "http://52.26.27.83/SchroederLife/12-21-1996.2.jpg",
            "http://52.26.27.83/SchroederLife/12-21-1996.jpg",
            "http://52.26.27.83/SchroederLife/12-23-2009.jpg",
            "http://52.26.27.83/SchroederLife/12-24-2007.jpg",
            "http://52.26.27.83/SchroederLife/AlSchroeder.jpg",
            "http://52.26.27.83/SchroederLife/cindy7a.JPG",
            "http://52.26.27.83/SchroederLife/IMAG0023.JPG",
            "http://52.26.27.83/SchroederLife/Image004.jpg",
    };

    /**
     * This are PicasaWeb thumbnail URLs and could potentially change. Ideally the PicasaWeb API
     * should be used to fetch the URLs.
     *
     * Credit to Romain Guy for the photos:
     * http://www.curious-creature.org/
     * https://plus.google.com/109538161516040592207/about
     * http://www.flickr.com/photos/romainguy
     */
    public final static String[] imageThumbUrls = new String[] {
            "http://jerome.lendmyvoice.org/images/IMG000002.jpg",
            "http://jerome.lendmyvoice.org/images/IMG000003.jpg",
            "http://jerome.lendmyvoice.org/images/IMG000004.jpg",
            "http://52.26.27.83/SchroederLife/008-04-2003.jpg",
            "http://52.26.27.83/SchroederLife/01-01-1972.jpg",
            "http://52.26.27.83/SchroederLife/01-01-2005.jpg",
            "http://52.26.27.83/SchroederLife/01-04-2003.jpg",
            "http://52.26.27.83/SchroederLife/02-02-2010.2.jpg",
            "http://52.26.27.83/SchroederLife/02-02-2010.jpg",
            "http://52.26.27.83/SchroederLife/02-03-2006.jpg",
            "http://52.26.27.83/SchroederLife/02-05-2004.jpg",
            "http://52.26.27.83/SchroederLife/02-05-2009.2.jpg",
            "http://52.26.27.83/SchroederLife/02-05-2009.jpg",
            "http://52.26.27.83/SchroederLife/02-19-2006.2.jpg",
            "http://52.26.27.83/SchroederLife/02-19-2006.3.jpg",
            "http://52.26.27.83/SchroederLife/02-19-2006.jpg",
            "http://52.26.27.83/SchroederLife/02-22-2010.jpg",
            "http://52.26.27.83/SchroederLife/03-12-2003.jpg",
            "http://52.26.27.83/SchroederLife/04-24-2004.jpg",
            "http://52.26.27.83/SchroederLife/04-25-2009.jpg",
            "http://52.26.27.83/SchroederLife/05-03-2013.JPG",
            "http://52.26.27.83/SchroederLife/05-26-2000.jpg",
            "http://52.26.27.83/SchroederLife/06-04-2014.jpg",
            "http://52.26.27.83/SchroederLife/06-10-2013.jpg",
            "http://52.26.27.83/SchroederLife/06-10-2014.jpg",
            "http://52.26.27.83/SchroederLife/06-22-2011.jpg",
            "http://52.26.27.83/SchroederLife/07-04-2011.2.jpg",
            "http://52.26.27.83/SchroederLife/07-04-2011.jpg",
            "http://52.26.27.83/SchroederLife/07-16-2010.jpg",
            "http://52.26.27.83/SchroederLife/08-13-2004.2.jpg",
            "http://52.26.27.83/SchroederLife/08-13-2004.jpg",
            "http://52.26.27.83/SchroederLife/09-02-2010.jpg",
            "http://52.26.27.83/SchroederLife/09-07-2011.jpg",
            "http://52.26.27.83/SchroederLife/09-11-2011.jpg",
            "http://52.26.27.83/SchroederLife/09-22-2004.jpg",
            "http://52.26.27.83/SchroederLife/10-06-2011.jpg",
            "http://52.26.27.83/SchroederLife/10-11-2003.jpg",
            "http://52.26.27.83/SchroederLife/10-16-2011.jpg",
            "http://52.26.27.83/SchroederLife/10-19-2010.jpg",
            "http://52.26.27.83/SchroederLife/10-26-2011.jpg",
            "http://52.26.27.83/SchroederLife/12-09-1999.jpg",
            "http://52.26.27.83/SchroederLife/12-21-1996.2.jpg",
            "http://52.26.27.83/SchroederLife/12-21-1996.jpg",
            "http://52.26.27.83/SchroederLife/12-23-2009.jpg",
            "http://52.26.27.83/SchroederLife/12-24-2007.jpg",
            "http://52.26.27.83/SchroederLife/AlSchroeder.jpg",
            "http://52.26.27.83/SchroederLife/cindy7a.JPG",
            "http://52.26.27.83/SchroederLife/IMAG0023.JPG",
            "http://52.26.27.83/SchroederLife/Image004.jpg",
    };
}
