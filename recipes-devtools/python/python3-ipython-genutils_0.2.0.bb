SUMMARY = "Pretend this doesn’t exist. Nobody should use it."
HOMEPAGE = "http://ipython.org/"
AUTHOR = "iPython Development Team<ipython-dev@scipy.org>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.md;md5=f7c3032c3ac398265224533a0a333a35"

SRC_URI = "https://files.pythonhosted.org/packages/e8/69/fbeffffc05236398ebfcfb512b6d2511c622871dca1746361006da310399/ipython_genutils-0.2.0.tar.gz"
SRC_URI[sha256sum] = "eb2e116e75ecef9d4d228fdc66af54269afa26ab4463042e33785b887c628ba8"

inherit python_setuptools_build_meta

S = "${WORKDIR}/ipython_genutils-0.2.0"

RDEPENDS:${PN} = "\
"

BBCLASSEXTEND = "native nativesdk"

